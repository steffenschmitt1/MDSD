/*
 * generated by Xtext 2.30.0
 */
package kit.mdsd.xtext.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("kit/mdsd/xtext/dsl/parser/antlr/internal/InternalDsl.tokens");
	}
}
