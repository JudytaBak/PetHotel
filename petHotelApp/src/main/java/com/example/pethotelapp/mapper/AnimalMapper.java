package com.example.pethotelapp.mapper;

import com.example.pethotelapp.dto.AnimalDto;
import com.example.pethotelapp.dto.OwnerDto;
import com.example.pethotelapp.model.AnimalModel;
import com.example.pethotelapp.model.OwnerModel;

public class AnimalMapper {
    public static AnimalDto toAnimalDto(AnimalModel animalModel) {
        AnimalDto animalDto = new AnimalDto();
        animalDto.setType(animalModel.getType());
        animalDto.setName(animalModel.getName());
        animalDto.setWeight(animalModel.getWeight());
        animalDto.setSex(animalModel.getSex());
       //animalDto.setOwnerId(animalDto.getOwnerId());
        return animalDto;
    }

    public static AnimalModel toAnimalModel(AnimalDto animalDto) {
        AnimalModel animalModel = new AnimalModel();
        animalModel.setType(animalDto.getType());
        animalModel.setName(animalDto.getName());
        animalModel.setWeight(animalDto.getWeight());
        animalModel.setSex(animalDto.getSex());
       //animalModel.setOwnerId(animalDto.getOwnerId());
        return animalModel;
    }
}
