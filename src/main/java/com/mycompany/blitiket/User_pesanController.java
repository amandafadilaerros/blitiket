/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

package com.mycompany.blitiket;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author AMANDA
 */


public class User_pesanController {

    @FXML
    private void SwitchJadwal() throws IOException {
        App.setRoot("user_jadwal");
    }
    @FXML
    private void SwitchPesan() throws IOException {
        App.setRoot("user_pesan");
    }
    @FXML
    private void SwitchRiwayat() throws IOException {
        App.setRoot("user_riwayat");
    }
    @FXML
    private void Keluar() throws IOException {
        App.setRoot("masuk");
    }
}