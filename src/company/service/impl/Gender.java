package company.service.impl;

public enum Gender{
    MAn("Man"),
    WOMAN("Girl");
private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
