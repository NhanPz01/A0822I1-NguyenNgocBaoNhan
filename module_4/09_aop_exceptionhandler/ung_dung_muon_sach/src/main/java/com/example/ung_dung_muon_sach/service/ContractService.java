package com.example.ung_dung_muon_sach.service;

import com.example.ung_dung_muon_sach.model.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> findAll();
    Contract findById(int id);
    Contract add(Contract contract);
}
