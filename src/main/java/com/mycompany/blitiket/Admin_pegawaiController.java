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


public class Admin_pegawaiController {

    @FXML
    private void SwitchBeranda() throws IOException {
        App.setRoot("admin_beranda");
    }
    @FXML
    private void SwitchUser() throws IOException {
        App.setRoot("admin_pegawai");
    }
    @FXML
    private void SwitchRute() throws IOException {
        App.setRoot("admin_rute");
    }
    @FXML
    private void SwitchJadwal() throws IOException {
        App.setRoot("admin_jadwal");
    }
    @FXML
    private void SwitchRiwayat() throws IOException {
        App.setRoot("admin_riwayat");
    }
    @FXML
    private void Keluar() throws IOException {
        App.setRoot("masuk");
    }
}