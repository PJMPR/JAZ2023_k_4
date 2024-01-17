package com.example.updaters.clients;

import com.example.contract.PersonDto;

import java.util.List;

public class RandomDataClient implements IRandomDataClient{

    private String url;

    @Override
    public List<PersonDto> getRandomPeople(int size) {
        return null;
    }
}
