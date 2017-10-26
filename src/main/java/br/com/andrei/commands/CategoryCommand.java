package br.com.andrei.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *  Command is a Behavioral design pattern with has as objective encapsulate the request.
 *  in CategoryCommandToCategory we implement a converter to do the conversion between command and entity.
 *  
 * @author andrei
 *
 */

@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {

	private String id;
	private String description;

}
