package аbstract;

public enum FacialExpressions {
    // Список выражений на лице
    GRIMACE_OF_DISGUST("grimace of disgust"),
    SMILE("smile");

    // Имя
    private final String facialExpressions;

    // Конструктор
    FacialExpressions(String facialExpressions) {
        this.facialExpressions = facialExpressions;
    }

    // Метод "Получить имя"
    public String getFacialExpressions() {
        return facialExpressions;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getFacialExpressions();
    }
}
