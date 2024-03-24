package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.domain.User;
import com.example.sem3HomeTask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UserRepository userRepository;
    // Связи с репозиториями

    //Поля UserService, NotificationService
    //Метод processRegistration
    // 1) В класс RegistrationService добавить поля UserService, NotificationService(добавить в
    // IOC контейнер аннотацией @Autowired или через конструктор класса)
    //2) Разработать метод processRegistration в котором:


    public void processRegistration(String name, int age, String email) {
        //- создается пользователь из параметров метода
        User newUser = userService.createUser(name, age, email);
        //- созданный пользователь добавляется в репозиторий
        dataProcessingService.addUserToList(newUser);
        //- через notificationService выводится сообщение в консоль
        notificationService.sendNotification("Новый пользователь успешно создан!");
    }
}
