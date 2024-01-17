package com.example.updaters.clients;

import com.example.contract.PersonDto;

import java.util.List;

public interface IRandomDataClient {

    List<PersonDto> getRandomPeople(int size);
}
