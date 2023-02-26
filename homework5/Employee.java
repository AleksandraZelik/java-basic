package homework5;

public class Employee {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private double costHour;

    public Employee(String firstName, String lastName, String jobTitle, double costHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.costHour = costHour;
    }

    public Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getCostHour() {
        return costHour;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCostHour(double costHour) {
        this.costHour = costHour;
    }

    public double salaryInMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            int workDayMonth = 31;
            final int WORK_DAY_HOUR = 8;
            final int REST_DAY_MONTH = 8;
            return costHour * WORK_DAY_HOUR * (workDayMonth - REST_DAY_MONTH);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            int workDayMonth = 30;
            final int WORK_DAY_HOUR = 8;
            final int REST_DAY_MONTH = 8;
            return costHour * WORK_DAY_HOUR * (workDayMonth - REST_DAY_MONTH);
        } else if (month == 2) {
            int workDayMonth = 28;
            final int WORK_DAY_HOUR = 8;
            final int REST_DAY_MONTH = 8;
            return costHour * WORK_DAY_HOUR * (workDayMonth - REST_DAY_MONTH);
        }
        return 0;
    }
    public double salaryInYear() {
        int workDayMonth1 = 31;
        int workDayMonth2 = 30;
        int workDayMonth3 = 28;
        final int WORK_DAY_HOUR = 8;
        final int REST_DAY_MONTH = 8;
        final int COUNT_MONTH_1 = 7;
        final int COUNT_MONTH_2 = 4;
        final int COUNT_MONTH_3 = 1;
        return  costHour * WORK_DAY_HOUR * ((COUNT_MONTH_1*(workDayMonth1 - REST_DAY_MONTH))+(COUNT_MONTH_2*(workDayMonth2 - REST_DAY_MONTH))+(COUNT_MONTH_3*(workDayMonth3 - REST_DAY_MONTH)));
    }
}
