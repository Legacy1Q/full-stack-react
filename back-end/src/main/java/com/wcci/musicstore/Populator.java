package com.wcci.musicstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wcci.musicstore.Models.Beatles;
import com.wcci.musicstore.Models.Employee;
import com.wcci.musicstore.Models.RecordStore;
import com.wcci.musicstore.Repositories.BeatlesRepo;
import com.wcci.musicstore.Repositories.EmployeeRepo;
import com.wcci.musicstore.Repositories.RecordStoreRepo;

// Spring boot will auto detect this and say pay attention to this
// CLR runs one time after intialization, to add data to app
@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private BeatlesRepo beatlesRepo;

    @Autowired
    private RecordStoreRepo recordStoreRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    // Do a quick fix on Populator to make this
    // string ... means they may or may NOT be strings
    @Override
    public void run(String... args) throws Exception {

        Beatles beatle1 = new Beatles("John", "The best one");
        beatlesRepo.save(beatle1);

        Beatles beatle2 = new Beatles("Paul", "He's pretty good");
        beatlesRepo.save(beatle2);

        Employee employee1 = new Employee("George");
        employeeRepo.save(employee1);

        RecordStore recordStore1 = new RecordStore("The Exchange");
        recordStoreRepo.save(recordStore1);
    }

}
