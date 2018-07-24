package com.example.Journal_OwlNote;

import com.example.Journal_OwlNote.Model.JournalResponse;
import com.example.Journal_OwlNote.Model.Question;
import com.example.Journal_OwlNote.repo.JournalRepsonseRepo;
import com.example.Journal_OwlNote.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class QuestionSeeder implements ApplicationRunner {
    @Autowired
    public JournalRepsonseRepo repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new JournalResponse("Where were you five years ago?"));
        repository.save(new JournalResponse("Write a letter to your older self."));
        repository.save(new JournalResponse("Write letters to your future children and grandchildren that you can give to them when they are older. These letters will help them understand the type of person you were at their age."));
        repository.save(new JournalResponse("Write letters to your boss or coworkers."));
        repository.save(new JournalResponse("Write about your daily activities so you can look back and remember each moment."));
    }
}