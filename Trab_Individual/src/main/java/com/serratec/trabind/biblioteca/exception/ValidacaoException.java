package com.serratec.trabind.biblioteca.exception;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.serratec.trabind.biblioteca.model.Livro;

public class ValidacaoException {

	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();

	Livro livro = new Livro();
	Set<ConstraintViolation<Livro>> violations = validator.validate(livro);
	{
		if (violations.isEmpty()) {
			System.out.println("Nenhuma violação de validação.");
		} else {
			for (ConstraintViolation<Livro> violation : violations) {
				System.out.println(violation.getMessage());
			}
		}

	}
}
