package com.example.tu_dien_en_vn.service;

import com.example.tu_dien_en_vn.model.Word;

import java.util.ArrayList;
import java.util.List;

public class WordServiceImpl implements WordService {
    public static List<Word> words = new ArrayList<>();
    static {
        words.add(new Word(1, "one", "số một"));
        words.add(new Word(2, "two", "số hai"));
        words.add(new Word(3, "three", "số ba"));
        words.add(new Word(4, "four", "số bốn"));
        words.add(new Word(5, "five", "số năm"));
        words.add(new Word(6, "six", "số sáu"));
        words.add(new Word(7, "seven", "số bảy"));
        words.add(new Word(8, "eight", "số tám"));
        words.add(new Word(9, "nine", "số chín"));
        words.add(new Word(10, "zero", "số không"));
    }


    @Override
    public String findByEn(String en) {
        for (Word word : words) {
            if (word.getEnMeaning().equals(en)) {
                return word.getVnMeaning();
            }
        }
        return null;
    }

    @Override
    public String findByVn(String vn) {
        for (Word word : words) {
            if (word.getVnMeaning().equals(vn)) {
                return word.getEnMeaning();
            }
        }
        return null;
    }
}
