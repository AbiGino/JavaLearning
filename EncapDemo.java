public class EncapDemo {
    private String name;
    private int section;
    private String scName;
    private String place;

    public String getName() {
        return name;
    }

    public int getSection() {
        return section;
    }

    public String getScName() {
        return scName;
    }

    public String getPlace() {
        return place;
    }

    public void setName(String fullName) {
        this.name = fullName;
    }

    public void setSection(int scSection) {
        this.section = scSection;
    }

    public void setScName(String schoolName) {
        this.scName = schoolName;
    }

    public void setPlace(String scPlace) {
        this.place = scPlace;
    }

}
class Demo{
    public static void main(String[] args)
    {
        EncapDemo em=new EncapDemo();
        em.setName("Berly");
        em.setSection(5);
        em.setScName("fatima girls hr.sec school");
        em.setPlace("valliyur");
        System.out.println("Name:" +em.getName());
        System.out.println("Section:" +em.getSection());
        System.out.println("School name:" +em.getScName());
        System.out.println("Place:" +em.getPlace());
        
    }
}