/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 *
 * @author Wilso
 */
public class Baseball extends Application {
    @FXML private ListView lvTeams;
    @FXML private TableView tblResult;
    
    private final List<BaseballSet> baseball = new ArrayList<>();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("baseball.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        baseball.setItems(stage);
        
        ObservableList<BaseballSet> result = FXCollections.observableArrayList();
        result.add(baseball);
        
        HashMap<String, Float> map = new HashMap<>();
        map = findPlayers();
        tblResult.setItems(map);
    }
    
    private Map<String, Float> findPlayers(){
     int atBats = baseball.getAtBats();
     int hits = baseball.getHits();
     HashMap<String, Float> map = new HashMap<>();
     
     double TeamAvg = hits / atBats;
        for(int i = 0; i < baseball.size(); i++)
            if( TeamAvg <= (baseball.get(i).getHits()/baseball.get(i).getAtBats())){
                map.put(baseball.get(i).getName(), (baseball.get(i).getHits()/baseball.get(i).getAtBats()));
            }
        return map;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
