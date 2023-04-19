package com.example.form_to_khai_y_te.model;

public class ExposureHistory {
    private Boolean animalExposureFor14Days;
    private Boolean nCoVExposure;

    public ExposureHistory() {
    }

    public ExposureHistory(Boolean animalExposureFor14Days, Boolean nCoVExposure) {
        this.animalExposureFor14Days = animalExposureFor14Days;
        this.nCoVExposure = nCoVExposure;
    }

    public Boolean getAnimalExposureFor14Days() {
        return animalExposureFor14Days;
    }

    public void setAnimalExposureFor14Days(Boolean animalExposureFor14Days) {
        this.animalExposureFor14Days = animalExposureFor14Days;
    }

    public Boolean getNCoVExposure() {
        return nCoVExposure;
    }

    public void setNCoVExposure(Boolean nCoVExposure) {
        this.nCoVExposure = nCoVExposure;
    }
}
