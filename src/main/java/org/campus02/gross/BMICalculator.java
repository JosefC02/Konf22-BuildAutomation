package org.campus02.gross;

public class BMICalculator {

    private double weightInKG;

    private double heightInM;

    public double getWeightInKG() {
        return weightInKG;
    }

    public double getHeightInM() {
        return heightInM;
    }

    public BMICalculator(double weightInKG, double heightInM) {
        this.weightInKG = weightInKG;
        this.heightInM = heightInM;
    }

    private double calculateBMI() {
        return weightInKG / (heightInM * heightInM);
    }

    /**
     * bmi grenzen
     * < 18.5 = underweight
     * 18.5 - 25 = normal
     * 25 - 30 = overweight
     * >30 = obese
     * @return
     */

    public String result() {
        double bmi = calculateBMI();
        if (bmi < 18.5 ) {
            return "underweight";
        } else if (bmi < 25) {
            return "normal";
        } else if (bmi < 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }
}
