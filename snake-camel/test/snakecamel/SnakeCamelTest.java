package snakecamel;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void capitalize() {
		SnakeCamelUtil cam=new SnakeCamelUtil();
		//cam.capitalize("a");
		String expected="a";
		String actual=cam.capitalize(expected);
		assertThat(actual, is("A"));
		assertThat(cam.capitalize("xyz"), is("Xyz"));		
	}
	@Test
	public void uncapitalize() {
		SnakeCamelUtil cam=new SnakeCamelUtil();

		assertThat(cam.uncapitalize("A"), is("a"));
		assertThat(cam.uncapitalize("Xyz"), is("xyz"));
		
	}
	@Test
	public void snakeToCamelCase() {
		SnakeCamelUtil cam=new SnakeCamelUtil();

		assertThat(cam.capitalize("abc"), is("Abc"));
		assertThat(cam.capitalize("abc_def"), is("AbcDef"));
		assertThat(cam.capitalize("abc_def_gh"), is("AbcDefGh"));
		assertThat(cam.capitalize("_abc_def"), is("AbcDef"));
		
	}

	@Test
	public void camelToSnakeCase() {
		SnakeCamelUtil cam=new SnakeCamelUtil();

		assertThat(cam.uncapitalize("Abc"), is("abc"));
		assertThat(cam.uncapitalize("AbcDef"), is("abc_def"));
		assertThat(cam.uncapitalize("AbcDefGh"), is("abc_def_gh"));	
	}
	
	private Matcher<? super String> is(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}