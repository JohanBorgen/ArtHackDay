package com.arthackday.killerapp.util;

import android.app.AlarmManager;
import android.content.Intent;


public class KillerConstants {




	public static final String EXTRA_KEY_AUDIO = "playAudio";

  public static final String EXTRA_KEY_PUSHCALL = "callPhone";

  /**
	   * TODO **P1**  You must put your Google Places API key here.
	   * You can get your API key from: 
	   * {@link http://code.google.com/apis/maps/documentation/places/#Limits}
	   */
	  private static String MY_API_KEY =   "";
	  
	  public static String PLACES_API_KEY = "&key=" + MY_API_KEY;
	  
	  /**
	   * You'll need to modify these values to suit your own app.
	   */
	  // TODO Turn off when deploying your app.
	  public static boolean DEVELOPER_MODE = true;
	  
	  /**
	   * These values control the user experience of your app. You should
	   * modify them to provide the best experience based on how your
	   * app will actually be used.
	   * TODO Update these values for your app.
	   */
	  // The default search radius when searching for places nearby.
	  public static int DEFAULT_RADIUS = 150;
	  // The maximum distance the user should travel between location updates. 
	  public static int MAX_DISTANCE = DEFAULT_RADIUS/2;
	  // The maximum time that should pass before the user gets a location update.
	  public static long MAX_TIME = AlarmManager.INTERVAL_FIFTEEN_MINUTES;
	  
	  // You will generally want passive location updates to occur less frequently
	  // than active updates. You need to balance location freshness with battery life.
	  // The location update distance for passive updates.
	  public static int PASSIVE_MAX_DISTANCE = MAX_DISTANCE;
	  // The location update time for passive updates
	  public static long PASSIVE_MAX_TIME = MAX_TIME;
	  // Use the GPS (fine location provider) when the Activity is visible?
	  public static boolean USE_GPS_WHEN_ACTIVITY_VISIBLE = true;
	  //When the user exits via the back button, do you want to disable
	  // passive background updates.
	  public static boolean DISABLE_PASSIVE_LOCATION_WHEN_USER_EXIT = false;
	  
	  // Maximum latency before you force a cached detail page to be updated.
	  public static long MAX_DETAILS_UPDATE_LATENCY = AlarmManager.INTERVAL_DAY;
	  
	  // Prefetching place details is useful but potentially expensive. The following
	  // values lets you disable prefetching when on mobile data or low battery conditions.
	  // Only prefetch on WIFI?
	  public static boolean PREFETCH_ON_WIFI_ONLY = false;
	  // Disable prefetching when battery is low?
	  public static boolean DISABLE_PREFETCH_ON_LOW_BATTERY = true;
	  
	  // How long to wait before retrying failed checkins.
	  public static long CHECKIN_RETRY_INTERVAL = AlarmManager.INTERVAL_FIFTEEN_MINUTES;
	  
	  // The maximum number of locations to prefetch for each update.
	  public static int PREFETCH_LIMIT = 5;
	 
	  
	  /**
	   * These values are constants used for intents, exteas, and shared preferences.
	   * You shouldn't need to modify them.
	   */
	  public static String SHARED_PREFERENCE_FILE = "SHARED_PREFERENCE_FILE";
	  public static String SP_KEY_FOLLOW_LOCATION_CHANGES = "SP_KEY_FOLLOW_LOCATION_CHANGES";
	  public static String SP_KEY_LAST_LIST_UPDATE_TIME = "SP_KEY_LAST_LIST_UPDATE_TIME";
	  public static String SP_KEY_LAST_LIST_UPDATE_LAT = "SP_KEY_LAST_LIST_UPDATE_LAT";
	  public static String SP_KEY_LAST_LIST_UPDATE_LNG = "SP_KEY_LAST_LIST_UPDATE_LNG";
	  public static String SP_KEY_LAST_CHECKIN_ID = "SP_KEY_LAST_CHECKIN_ID";
	  public static String SP_KEY_LAST_CHECKIN_TIMESTAMP = "SP_KEY_LAST_CHECKIN_TIMESTAMP";
	  public static String SP_KEY_RUN_ONCE = "SP_KEY_RUN_ONCE";
	  
	  public static String EXTRA_KEY_REFERENCE = "reference";
	  public static String EXTRA_KEY_ID = "id";
	  public static String EXTRA_KEY_LOCATION = "location";
	  public static String EXTRA_KEY_RADIUS = "radius";
	  public static String EXTRA_KEY_TIME_STAMP = "time_stamp";
	  public static String EXTRA_KEY_FORCEREFRESH = "force_refresh";
	  public static String EXTRA_KEY_IN_BACKGROUND = "EXTRA_KEY_IN_BACKGROUND";
	  
	  public static String EXTRA_KEY_FILEPATH = "filename";
	  
	  
	  public static boolean SUPPORTS_GINGERBREAD = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.GINGERBREAD;
	  public static boolean SUPPORTS_HONEYCOMB = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB;
	  public static boolean SUPPORTS_FROYO = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.FROYO;
	  public static boolean SUPPORTS_ECLAIR = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.ECLAIR;
	  
	  
	  public static String ARGUMENTS_KEY_REFERENCE = "reference";
	  public static String CONSTRUCTED_LOCATION_PROVIDER = "CONSTRUCTED_LOCATION_PROVIDER";
}
