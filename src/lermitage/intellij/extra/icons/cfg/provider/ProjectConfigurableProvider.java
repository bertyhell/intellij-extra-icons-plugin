package lermitage.intellij.extra.icons.cfg.provider;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import com.intellij.openapi.project.Project;
import lermitage.intellij.extra.icons.cfg.SettingsForm;
import org.jetbrains.annotations.Nullable;

public class ProjectConfigurableProvider extends ConfigurableProvider {

    private final Project project;

    public ProjectConfigurableProvider(Project project) {
        this.project = project;
    }

    @Nullable
    @Override
    public Configurable createConfigurable() {
        return new SettingsForm(project);
    }
}
