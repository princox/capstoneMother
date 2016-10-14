package capstonemother.rhee.hlab.capstonemother;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final int REQUEST_ENABLE_BT = 2;
    private static final boolean booleanValue = true;
    private int mSelectedBtn;
    private static final int STATE_SENDING = 1;
    private static final int STATE_NO_SENDING = 2;
    private int mSendingState;
    public static final int MODE_REQUEST = 1;
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_WRITE = 2;
    public static final int MESSAGE_READ = 3;
    private BluetoothService bluetoothService_obj = null;
    private StringBuffer mOutStringBuffer;
    private static final String TAG = "Main";

    int[] father = {0, 0, 0, 0, 0, 0, 0, 0};
    int[] mother = {0, 0, 0, 0, 0, 0, 0, 0};
    //mother, father 순
    int[] onoff = {0, 0};
    int total;
    int total2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (bluetoothService_obj == null) {
            bluetoothService_obj = new BluetoothService(this, mHandler);
            mOutStringBuffer = new StringBuffer("");
        }

        bluetoothService_obj.setHandler(mHandler);


        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        Button button15 = (Button) findViewById(R.id.button15);
        Button button16 = (Button) findViewById(R.id.button16);
        Button button17 = (Button) findViewById(R.id.button17);
        Button button18 = (Button) findViewById(R.id.button18);
        Button button19 = (Button) findViewById(R.id.button19);
        Button button20 = (Button) findViewById(R.id.button20);


        button2.setOnClickListener(new View.OnClickListener() {
            /**
             * 블루투스 켜기 (목록 불러와서 연결)
             */
            @Override
            public void onClick(View view) {
                if (bluetoothService_obj.getDeviceState()) {
                    bluetoothService_obj.enableBluetooth();
                } else {
                    finish();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 0번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0;
                }

                mother[0] = 1;

                if (father[6] == 1) {
                  total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }

                mother[0] = 1;
                String mother = "s" + total + "0" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = "";
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 1번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0;
                }
                mother[1] = 1;

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }

                String mother = "s" + total + "1" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = "";
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 2번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0; //엄마 전부 초기화
                }
                mother[2] = 1;

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }
                String mother = "s" + total + "2" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = "";
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 3번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0;
                }
                mother[3] = 1;

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }
                String mother = "s" + total + "3" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = "";
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 4번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0;
                }
                mother[4] = 1;

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }
                String mother = "s" + total + "4" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = "";
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 5번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0;
                }
                mother[5] = 1;

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }
                String mother = "s" + total + "5" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = "";
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 6번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    mother[i] = 0;
                }
                mother[6] = 1;

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }
                String mother = "s" + total + "6" + onoff[0] + onoff[1] + "e";
                sendMessage(mother, STATE_SENDING);
//                total = 0;
                mother = ""; //엄마 배열을 지우는게 아니라 message를 지우는거임
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 깜빡임 Off
             */
            @Override
            public void onClick(View view) {

                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }

                if (mother[6] == 1) {
                    total2 = 6;
                } else if (mother[5] == 1) {
                    total2 = 5;
                } else if (mother[4] == 1) {
                    total2 = 4;
                } else if (mother[3] == 1) {
                    total2 = 3;
                } else if (mother[2] == 1) {
                    total2 = 2;
                } else if (mother[1] == 1) {
                    total2 = 1;
                } else if (mother[0] == 1) {
                    total2 = 0;
                }

                onoff[1] = 0;
                String mother = "s" + total + total2 + onoff[0] + 0 + "e";
                sendMessage(mother, STATE_SENDING);
                total = 0;
                mother = "";
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            /**
             * 엄마 깜빡임 On
             */
            @Override
            public void onClick(View view) {
                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }

                if (mother[6] == 1) {
                    total2 = 6;
                } else if (mother[5] == 1) {
                    total2 = 5;
                } else if (mother[4] == 1) {
                    total2 = 4;
                } else if (mother[3] == 1) {
                    total2 = 3;
                } else if (mother[2] == 1) {
                    total2 = 2;
                } else if (mother[1] == 1) {
                    total2 = 1;
                } else if (mother[0] == 1) {
                    total2 = 0;
                }

                onoff[1] = 1;
                String mother = "s" + total + total2 + onoff[0] + 1 + "e";
                sendMessage(mother, STATE_SENDING);

                total = 0;
                total2 = 0;
                mother = "";
            }
        });


        /**
         *
         *
         * 엄마와 아빠의 경계
         *
         *
         */


        button1.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 0번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[0] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "0" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);

                total = 0;
                Log.d("father", "father value : " + father);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 1번 -> 아빠는 무조건 1로하고 나머지는 그대로 유지
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[1] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "1" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
                father = "";
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 2번 -> 아빠 숫자 2로 하고 나머지는 유지
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[2] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "2" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
//                total = 0;
                father = "";
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 3번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[3] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "3" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
                total = 0;
                father = "";
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 4번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[4] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "4" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
//                total = 0;
                father = "";
            }
        });


        button13.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 5번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[5] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "5" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
//                total = 0;
                father = "";
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 6번
             */
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 8; i++) {
                    father[i] = 0;
                }

                father[6] = 1;

                if (mother[6] == 1) {
                    total = 6;
                } else if (mother[5] == 1) {
                    total = 5;
                } else if (mother[4] == 1) {
                    total = 4;
                } else if (mother[3] == 1) {
                    total = 3;
                } else if (mother[2] == 1) {
                    total = 2;
                } else if (mother[1] == 1) {
                    total = 1;
                } else if (mother[0] == 1) {
                    total = 0;
                }
                String father = "s" + "6" + total + onoff[0] + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
//                total = 0;
                father = "";
            }
        });


        button17.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 깜빡임 On
             */
            @Override
            public void onClick(View view) {
                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }

                if (mother[6] == 1) {
                    total2 = 6;
                } else if (mother[5] == 1) {
                    total2 = 5;
                } else if (mother[4] == 1) {
                    total2 = 4;
                } else if (mother[3] == 1) {
                    total2 = 3;
                } else if (mother[2] == 1) {
                    total2 = 2;
                } else if (mother[1] == 1) {
                    total2 = 1;
                } else if (mother[0] == 1) {
                    total2 = 0;
                }

                onoff[0] = 1;
                String father = "s" + total + total2 + 1 + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
                father = "";
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            /**
             * 아빠 깜빡임 Off
             */
            @Override
            public void onClick(View view) {
                if (father[6] == 1) {
                    total = 6;
                } else if (father[5] == 1) {
                    total = 5;
                } else if (father[4] == 1) {
                    total = 4;
                } else if (father[3] == 1) {
                    total = 3;
                } else if (father[2] == 1) {
                    total = 2;
                } else if (father[1] == 1) {
                    total = 1;
                } else if (father[0] == 1) {
                    total = 0;
                }

                if (mother[6] == 1) {
                    total2 = 6;
                } else if (mother[5] == 1) {
                    total2 = 5;
                } else if (mother[4] == 1) {
                    total2 = 4;
                } else if (mother[3] == 1) {
                    total2 = 3;
                } else if (mother[2] == 1) {
                    total2 = 2;
                } else if (mother[1] == 1) {
                    total2 = 1;
                } else if (mother[0] == 1) {
                    total2 = 0;
                }

                onoff[0] = 0;

                String father = "s" + total + total2 + 0 + onoff[1] + "e";
                sendMessage(father, STATE_SENDING);
                total = 0;
                father = "";
            }
        });


    }


    private final Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {

            super.handleMessage(msg);

            switch (msg.what) {

                case MESSAGE_READ:
                    int i = 0;
                    byte[] readBuf = (byte[]) msg.obj;
                    String readMessage = new String(readBuf, 0, msg.arg1);
                    TextView text;
//                    text = (TextView) findViewById(R.id.textView);

//                    text.setText(String.valueOf(readMessage));

                    Log.e("Time data", readMessage);

                    break;

                case MESSAGE_STATE_CHANGE:
                    if (booleanValue) Log.i(TAG, "MESSAGE_STATE_CHANGE: " + msg.arg1);

                    switch (msg.arg1) {
                        case BluetoothService.STATE_CONNECTED:
                            Toast.makeText(getApplicationContext(), "블루투스 연결에 성공하였습니다!", Toast.LENGTH_SHORT).show();
                            break;

                        case BluetoothService.STATE_FAIL:
                            Toast.makeText(getApplicationContext(), "블루투스 연결에 실패했습니다!", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    break;
                case MESSAGE_WRITE:
                    String writeMessage = null;
                    if (mSelectedBtn == 1) {
//                        writeMessage = mbtn1.getText().toString();
                        mSelectedBtn = -1;
                    } else if (mSelectedBtn == 2) {
//                        writeMessage = mbtn2.getText().toString();
                        mSelectedBtn = -1;
                    } else {
                        byte[] writeBuf = (byte[]) msg.obj;
                        writeMessage = new String(writeBuf);
                    }
                    break;
            }
        }
    };

    /**
     * end
     **/

    /**
     * added
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, "onActivityResult" + resultCode);
        // TODO Auto-generated method stub

        switch (requestCode) {

            case REQUEST_ENABLE_BT:
                //When the request to enable Bluetooth returns
                if (resultCode != Activity.RESULT_OK)  //취소를 눌렀을 때
                {
                    bluetoothService_obj.scanDevice();
                } else {
                    Log.d(TAG, "Bluetooth is not enable");
                }
                break;
            case REQUEST_CONNECT_DEVICE:
                if (resultCode == Activity.RESULT_OK) {
                    bluetoothService_obj.getDeviceInfo(data);
                }
                break;
        }
    }

    private synchronized void sendMessage(String message, int mode) {

        if (mSendingState == STATE_SENDING) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        mSendingState = STATE_SENDING;

        // Check that we're actually connected before trying anything
        if (bluetoothService_obj.getState() != BluetoothService.STATE_CONNECTED) {
            mSendingState = STATE_NO_SENDING;
            return;
        }

        // Check that there's actually something to send
        if (message.length() > 0) {
            // Get the message bytes and tell the BluetoothChatService to write
            byte[] send = message.getBytes();
            bluetoothService_obj.write(send, mode);

            // Reset out string buffer to zero and clear the edit text field
            mOutStringBuffer.setLength(0);

        }

        mSendingState = STATE_NO_SENDING;
        notify();
    }
}
