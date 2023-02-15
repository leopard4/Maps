package com.leopard4.maps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 지도를 표시할 프래그먼트를 생성하고 지도를 표시
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        // 지도가 준비되면 onMapReady()를 호출
        mapFragment.getMapAsync(this);
    }

    // 마커 눌렀을때 처리할 코드 작성
    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        return false;
    }

    // 지도가 준비되면 호출되는 메서드
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        // 내 위치정보를 가져와서

        // 지도의 중심을 내 위치로 이동

        // 마커를 만들어서, 지도에 표시

    }
}