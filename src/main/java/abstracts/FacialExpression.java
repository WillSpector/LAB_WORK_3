package abstracts;

public enum FacialExpression {
    // Список выражений на лице
    GRIMACE_OF_DISGUST("grimace of disgust"),
    SMILE("smile");

    // Поле
    private final String value;

    // Конструктор
    FacialExpression(String value) {
        this.value = value;
    }

    // Метод "Получить имя"
    public String getFacialExpression() {
        return value;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return getFacialExpression();
    }
}