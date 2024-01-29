package menstruationApplication;

import java.time.LocalDate;

    public class Menstruation {
        private String name;
        private int age;
        private LocalDate lastMonthMenstrualFlow;
        private LocalDate lastTwoMonthMenstrualFlow;
        private LocalDate nextMenstualFlow;
        private int cycle;
        private String month;
        private String day;
        private String year;

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public LocalDate getLastMonthMenstrualFlow() {
            return lastMonthMenstrualFlow;
        }

        public void setLastMonthMenstrualFlow(String year, String months, String day) {
            this.lastMonthMenstrualFlow = LocalDate.parse(getDate(year, months, day));
        }

        private     String getDate(String year, String months, String day) {
            return year + "-" + months + "-" + day;
        }

        public LocalDate getLastTwoMonthMenstrualFlow() {
            return lastTwoMonthMenstrualFlow;
        }


        public void setLastTwoMonthMenstrualFlow(String year, String month, String day) {
            this.lastTwoMonthMenstrualFlow = LocalDate.parse(getDate(year, month, day));
        }

        public LocalDate getNextMenstualFlow(int cycle,String year, String months, String day) {
            this.lastMonthMenstrualFlow = LocalDate.parse(getDate(year,months,day));
            this.nextMenstualFlow = this.lastMonthMenstrualFlow;
            this.cycle = cycle;
            return nextMenstualFlow.plusDays(getCycle());
        }

        public int getCycle() {
            return cycle;
        }

        public LocalDate getOvulation() {
            int ovulation = getCycle() - 14;
            return nextMenstualFlow.plusDays(ovulation);
        }

        public LocalDate getSafePeriodStart() {
            int freePeriodstarts = (getCycle() - 14) - 9;
            return nextMenstualFlow.plusDays(freePeriodstarts);
        }

        public LocalDate getSafePeriodEnds() {
            int freePeriodEnds = (getCycle() - 14) - 4;
            return nextMenstualFlow.plusDays(freePeriodEnds);
        }
    }



