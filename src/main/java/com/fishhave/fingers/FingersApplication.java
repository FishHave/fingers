package com.fishhave.fingers;

import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.localization.Language;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class FingersApplication extends GameApplication {


    @Override
    protected void initSettings(GameSettings settings) {
        settings.set3D(false);
        settings.setApplicationMode(ApplicationMode.DEVELOPER);
        settings.setCredits(List.of("FishHave"));
        settings.setClickFeedbackEnabled(true);
        settings.setDefaultLanguage(Language.CHINESE);
        settings.setDeveloperMenuEnabled(true);
        settings.setFullScreenAllowed(true);
        settings.setGameMenuEnabled(true);
        settings.setTitle("Fingers");
        settings.setVersion("Alpha v0.1");
    }

    public static void main(String[] args) {
        launch(args);
    }
}