package Pojo;

public class Student {
    private Integer sno;
    private String name;
    private String ssex;
    private Integer sage;
    private String sdept;

    public Student() {
    }

    public Student(String name, String ssex, Integer sage, String sdept) {
        this.name = name;
        this.ssex = ssex;
        this.sage = sage;
        this.sdept = sdept;
    }

    public Student(Integer sno, String name, String ssex, Integer sage, String sdept) {
        this.sno = sno;
        this.name = name;
        this.ssex = ssex;
        this.sage = sage;
        this.sdept = sdept;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                ", sdept='" + sdept + '\'' +
                '}';
    }
}
