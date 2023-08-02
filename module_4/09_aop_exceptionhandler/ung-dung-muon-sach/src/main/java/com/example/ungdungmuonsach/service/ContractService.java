package com.example.ungdungmuonsach.service;

import com.example.ungdungmuonsach.dto.ContractCreateDTO;
import com.example.ungdungmuonsach.model.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> findAll();
    Contract findById(int id);
    Contract add(ContractCreateDTO contractDto);
}
