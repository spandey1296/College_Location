package com.example.mylocation;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng chitkara = new LatLng(30.8769976,76.8723691);
        mMap.addMarker(new MarkerOptions().position(chitkara).title("Hii, I'm shivant here").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chitkara));


        LatLng aurangabad = new LatLng(28.5449756,77.190439);
        mMap.addMarker(new MarkerOptions().position(aurangabad).title("Hii,IIT DELHI").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aurangabad));

        LatLng chitkara1 = new LatLng(19.1334302,72.9110792);
        mMap.addMarker(new MarkerOptions().position(chitkara1).title("Hii,IIT BOMBAY ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chitkara1));


        LatLng chitkara2 = new LatLng(30.8769976,76.8701804);
        mMap.addMarker(new MarkerOptions().position(chitkara2).title("Hii,Chitkara University Baddi Campus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chitkara2));



        LatLng chitkara3 = new LatLng(30.5160865,76.6575891);
        mMap.addMarker(new MarkerOptions().position(chitkara3).title("Hii,Chitkara University PB Campus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chitkara3));


        LatLng chitkara5 = new LatLng(13.0108831,80.2331881);
        mMap.addMarker(new MarkerOptions().position(chitkara5).title("Hii,ANNA UNIVERSITY").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chitkara5));




        LatLng chitkara4 = new LatLng(12.9722046,79.160547);
        mMap.addMarker(new MarkerOptions().position(chitkara4).title("Hii,VELLORE UNIVERSITY").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chitkara4));
        
        
        
          LatLng lang = new LatLng(22.3149274,87.3083424);
        mMap.addMarker(new MarkerOptions().position(lang).title("Hii,IIT ROORKEE").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lang));


        LatLng place1 = new LatLng(26.5123388,80.2307113);
        mMap.addMarker(new MarkerOptions().position(place1).title("Hii,IIT KANPUR").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place1));


        LatLng place2 = new LatLng(23.2114604,72.681997);
        mMap.addMarker(new MarkerOptions().position(place2).title("Hii,IIT GANDHINAGAR").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place2));

        LatLng place3 = new LatLng(10.801716,76.8163603);
        mMap.addMarker(new MarkerOptions().position(place3).title("Hii,IIT PALAKADD").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place3));

        LatLng place4 = new LatLng(17.5947027,78.1208514);
        mMap.addMarker(new MarkerOptions().position(place4).title("Hii,IIT HYDERABAD ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place4));

        LatLng place5 = new LatLng(21.1628429,81.6574324);
        mMap.addMarker(new MarkerOptions().position(place5).title("Hii,IIT BHILAI ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place5));


        LatLng place6 = new LatLng(22.5203597,75.9185344);
        mMap.addMarker(new MarkerOptions().position(place6).title("Hii,IIT INDORE").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place6));
        






    }

}
