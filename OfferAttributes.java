public class OfferAttributes {
    public String companyName,jobTitle, location;
    public int salary;
    public boolean isfullTime,hasBenefit, hasPTO, isWFH;

    public void setInfo(String companyName, String jobTitle, String location, int salary, boolean isfullTime, boolean hasBenefit, boolean hasPTO, boolean isWFH) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.location = location;
        this.salary = salary;
        this.isfullTime = isfullTime;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
    }

    public String toString() {
        return "OfferAttributes{" +
                "companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isfullTime=" + isfullTime +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                '}';
    }
}
/*
Create a custom class named Offer
        Attributes:
               Create a custom class named Offer
        Attributes:
                location
                companyName
                jobTitle
                salary
                hasBenefit
                hasPTO
                isWFH
                isFullTime

        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object
 */
