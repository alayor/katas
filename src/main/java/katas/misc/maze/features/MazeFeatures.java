
package katas.misc.maze.features;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "junit:output" },
        snippets = SnippetType.CAMELCASE,
        glue = { "katas.misc.maze.features" },
        features = { "src/main/java/katas/misc/maze/features" },
        monochrome = true)
public class MazeFeatures
{
}
