import org.bukkit.plugin.java.JavaPlugin;

public class Community extends JavaPlugin {
    private static Community instance;
    @Override
    public void onLoad() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {
        instance = this;

    }

    public void pluginManager(){

    }

    public static Community getInstance() {
        return instance;
    }
}
