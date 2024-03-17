package ru.geekbrain;
/*
*Создать проект с использованием Maven или Gradle, добавить в него несколько
* зависимостей и написать код, использующий эти зависимости.
Пример решения:
1+. Создайте новый Maven или Gradle проект, следуя инструкциям из блока
* 1 или блока 2.
2+. Добавьте зависимости org.apache.commons:commons-lang3:3.14.0 и
* com.google.code.gson:gson:2.10.1.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString,
* equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации
* объектов класса Person в формат JSON. */

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

public class Person implements Serializable {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Person person)) return false;

        return new EqualsBuilder().
                append(firstName, person.firstName).
                append(lastName, person.lastName).
                append(age, person.age).
                isEquals();
    }


}
