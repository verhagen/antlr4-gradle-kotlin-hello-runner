import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class HelloRunner {

	public static void main( String[] args) throws Exception {
		System.out.println("" + new HelloRunner().main(args[0]));
	}

	public String main(String input) throws Exception {
		CodePointCharStream stream = CharStreams.fromString(input);

		HelloLexer lexer = new HelloLexer(stream);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.r(); // begin parsing at rule 'r'
		return tree.toStringTree(parser); // print LISP-style tree
	}
}
