package org.sahil.advanceJava.Model;

public class Qualifications {
    // id,studentid,degree,stream,year
    private int id;
    private int studentId;
    private String degree;
    private String  stream;
    private  String year;

    public Qualifications() {
    }

    public Qualifications(int id, int studentId, String degree, String stream, String year) {
        this.id = id;
        this.studentId = studentId;
        this.degree = degree;
        this.stream = stream;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Qualifications{" +
                 "id=" + id +
                ", studentId=" + studentId +
                ", degree='" + degree + '\'' +
                ", stream='" + stream + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
