package com.example.form_to_khai_y_te.model;

public class HealthStatus {
    private Boolean fever; // sốt
    private Boolean cough; // ho
    private Boolean shortnessOfBreath; // khó thở
    private Boolean soreThroat; // đau họng
    private Boolean nausea; // nôn/buồn nôn
    private Boolean diarrhea; // tiêu chảy
    private Boolean skinHemorrhage; // xuất huyết ngoài da
    private Boolean skinRash; // nổi ban ngoài da

    public HealthStatus() {
    }

    public HealthStatus(Boolean fever, Boolean cough, Boolean shortnessOfBreath, Boolean soreThroat, Boolean nausea, Boolean diarrhea, Boolean skinHemorrhage, Boolean skinRash) {
        this.fever = fever;
        this.cough = cough;
        this.shortnessOfBreath = shortnessOfBreath;
        this.soreThroat = soreThroat;
        this.nausea = nausea;
        this.diarrhea = diarrhea;
        this.skinHemorrhage = skinHemorrhage;
        this.skinRash = skinRash;
    }

    public Boolean getFever() {
        return fever;
    }

    public void setFever(Boolean fever) {
        this.fever = fever;
    }

    public Boolean getCough() {
        return cough;
    }

    public void setCough(Boolean cough) {
        this.cough = cough;
    }

    public Boolean getShortnessOfBreath() {
        return shortnessOfBreath;
    }

    public void setShortnessOfBreath(Boolean shortnessOfBreath) {
        this.shortnessOfBreath = shortnessOfBreath;
    }

    public Boolean getSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(Boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public Boolean getNausea() {
        return nausea;
    }

    public void setNausea(Boolean nausea) {
        this.nausea = nausea;
    }

    public Boolean getDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(Boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public Boolean getSkinHemorrhage() {
        return skinHemorrhage;
    }

    public void setSkinHemorrhage(Boolean skinHemorrhage) {
        this.skinHemorrhage = skinHemorrhage;
    }

    public Boolean getSkinRash() {
        return skinRash;
    }

    public void setSkinRash(Boolean skinRash) {
        this.skinRash = skinRash;
    }
}
