package аbstract;

public enum FacialExpressions {
    GRIMACE_OF_DISGUST("grimace of disgust"),
    SMILE("smile");

    // Переменная для хранения предмета
    private final String facialExpressions;

    FacialExpressions(String FacialExpressions) {
        this.facialExpressions = FacialExpressions;
    }

    public String getFacialExpressions() {
        return facialExpressions;
    }

    @Override
    // Переопределяем метод toString
    public String toString() {
        return getFacialExpressions();
    }
}
