package online.agatstudio.basic_example;

public class Main {
    public static void main(String[] args) {

        BeanFactory beanFactory = new BeanFactory(); // создали контейнер
        beanFactory.register(Injectable.class); // регистрируем один бин
        beanFactory.register(Source.class); // регистрируем второй бин

        Source source = beanFactory.getBean(Source.class); // получаем бин Source из контейнера
        source.call(); // вызываем метод на бине, который вызывает метод на другом бине
    }
}