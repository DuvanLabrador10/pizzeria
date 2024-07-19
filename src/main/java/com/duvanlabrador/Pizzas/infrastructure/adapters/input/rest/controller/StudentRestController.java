package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.controller;

import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.request.StudentRequestDto;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.response.StudentResponseDto;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.handler.IStudentHandler;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentRestController {

    private final IStudentHandler iStudentHandler;

    @GetMapping("")
    public ResponseEntity<List<StudentResponseDto>> getAllStudents(@RequestParam(value = "page", defaultValue = "0") int page,
                                                                   @RequestParam(value = "size", defaultValue = "10") int size){
        return ResponseEntity.ok(iStudentHandler.getAllStudents(page,size));
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentResponseDto> getStudentById(@PathVariable Long studentId){
        return ResponseEntity.ok(this.iStudentHandler.getStudentById(studentId));
    }

    @PostMapping("")
    public ResponseEntity<StudentResponseDto> createStudent(@RequestBody StudentRequestDto studentRequestDto){
       StudentResponseDto studentResponseDto = this.iStudentHandler.createStudent(studentRequestDto);
       return new ResponseEntity<>(studentResponseDto, HttpStatus.CREATED);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<StudentResponseDto> updateStudent(@PathVariable Long studentId, @RequestBody StudentRequestDto studentRequestDto){
        StudentResponseDto studentResponseDto = this.iStudentHandler.updateStudent(studentId,studentRequestDto);
        return new ResponseEntity<>(studentResponseDto, HttpStatus.OK);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long studentId){
        this.iStudentHandler.deleteStudent(studentId);
        return ResponseEntity.ok().build();
    }

}
