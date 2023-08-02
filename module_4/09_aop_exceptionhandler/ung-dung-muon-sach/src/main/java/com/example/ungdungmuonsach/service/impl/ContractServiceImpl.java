package com.example.ungdungmuonsach.service.impl;

import com.example.ungdungmuonsach.dto.ContractCreateDTO;
import com.example.ungdungmuonsach.model.Contract;
import com.example.ungdungmuonsach.repository.ContractRepository;
import com.example.ungdungmuonsach.service.ContractService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository repository;

    @Override
    public List<Contract> findAll() {
        return repository.findAll();
    }

    @Override
    public Contract findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Contract add(ContractCreateDTO contractDto) {
        if (contractDto.getBook().getAmount() == 0) {
            return null;
        }
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDto, contract);
        String password = "";
        for (int i = 0; i < 5; ++i) {
            int num = (int) (Math.random() * (9 - 0) + 0);
            password += String.valueOf(num);
        }
        contract.setPassword(password);
        System.out.println(password);
        return repository.save(contract);
    }
}
