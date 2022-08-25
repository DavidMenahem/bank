package com.david.atm.controller;

import com.david.atm.entities.Delta;
import com.david.atm.service.DeltaService;
import com.david.atm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("atm")
@RequiredArgsConstructor
public class DeltaController {

    private final DeltaService deltaService;

    private final UserService userService;

    @PostMapping
    public Delta delta(@RequestBody Delta delta, @RequestParam long userId) {
        return deltaService.delta(delta, userId);
    }
}
