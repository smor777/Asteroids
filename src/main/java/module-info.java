module com.me.sammorin.snakegame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.me.sammorin.asteroids to javafx.fxml;
    exports com.me.sammorin.asteroids;
}