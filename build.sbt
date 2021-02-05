import laika.helium.Helium
import laika.markdown.github.GitHubFlavor

enablePlugins(LaikaPlugin)

laikaExtensions := Seq(GitHubFlavor)

laikaTheme := Helium.defaults
  .build

laikaIncludeEPUB := true
laikaIncludePDF := true
