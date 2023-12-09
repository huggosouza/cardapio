package br.digital.cardapio.controller;

import br.digital.cardapio.food.Food;
import br.digital.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("foods")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<Food> getAll(){
        return repository.findAll();
    }

    @PostMapping
    public Food addFood(@RequestBody Food food){
        return repository.save(food);
    }
}
