package com.acosta.carros.domain.dto;

import org.modelmapper.ModelMapper;

import com.acosta.carros.domain.Carro;

import lombok.Data;

@Data
public class CarroDTO {
	
	private Long id;	
	private String nome;
	private String tipo;
	
	public static CarroDTO create(Carro c) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(c, CarroDTO.class);
	}
	
	
}
