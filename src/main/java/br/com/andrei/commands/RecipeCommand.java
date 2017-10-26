package br.com.andrei.commands;

import java.util.HashSet;
import java.util.Set;

import br.com.andrei.domain.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {

	private String id;
	private String description;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String url;
	private String directions;
	
	private Set<IngredientCommand> ingredients = new HashSet<>();
	private Byte[] image;
	private Difficulty difficulty;
	private NotesCommand notes = new NotesCommand();
	private Set<CategoryCommand> categories = new HashSet<>();

}
