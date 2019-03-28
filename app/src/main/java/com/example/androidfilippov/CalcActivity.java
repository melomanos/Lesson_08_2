package com.example.androidfilippov;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    private TextView resultTViewCalc;
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button pointBtn;
    private Button cancelBtn;
    private Button plusBtn;
    private Button minusBtn;
    private Button multiplyBtn;
    private Button divideBtn;
    private Button plusMinusBtn;
    private Button percentBtn;
    private Button equalsBtn;

    private Button changeMode;
    private Button changeModeI;
    private RelativeLayout usualMode;
    private RelativeLayout engineeringMode;

    private TextView resultTViewCalcI;
    private Button zeroBtnI;
    private Button oneBtnI;
    private Button twoBtnI;
    private Button threeBtnI;
    private Button fourBtnI;
    private Button fiveBtnI;
    private Button sixBtnI;
    private Button sevenBtnI;
    private Button eightBtnI;
    private Button nineBtnI;
    private Button pointBtnI;
    private Button cancelBtnI;
    private Button plusBtnI;
    private Button minusBtnI;
    private Button multiplyBtnI;
    private Button divideBtnI;
    private Button plusMinusBtnI;
    private Button percentBtnI;
    private Button equalsBtnI;

    private int operand1;
    private int operand2;
    private int operand3;
    private int operand4;
    private int flagAction = 0;
    private int preResult = 0;
    private int preChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        initViews();
        usualMode.setVisibility(View.GONE);
        engineeringMode.setVisibility(View.VISIBLE);

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "0");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "2");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "3");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "4");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "5");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "6");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "7");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "8");
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + "9");
            }
        });

        pointBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText(resultTViewCalc.getText() + ".");
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalc.setText("");
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 1;
                operand1 = Integer.parseInt((String) resultTViewCalc.getText());
                resultTViewCalc.setText("");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 2;
                operand1 = Integer.parseInt((String) resultTViewCalc.getText());
                resultTViewCalc.setText("");
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 3;
                operand1 = Integer.parseInt((String) resultTViewCalc.getText());
                resultTViewCalc.setText("");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 4;
                operand1 = Integer.parseInt((String) resultTViewCalc.getText());
                resultTViewCalc.setText("");
            }
        });

        plusMinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt((String) resultTViewCalc.getText());
                preChange = a - a - a;
                String change = String.valueOf(preChange);
                resultTViewCalc.setText(change);
            }
        });

        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand2 = Integer.parseInt((String) resultTViewCalc.getText());

                switch(flagAction) {
                    case 1:
                        preResult = operand1 + operand2;
                        break;
                    case 2:
                        preResult = operand1 - operand2;
                        break;
                    case 3:
                        preResult = operand1 * operand2;
                        break;
                    case 4:
                        preResult = operand1 / operand2;
                        break;
                    default:
                        resultTViewCalc.setText("Операция не задана");
                }

                String result = String.valueOf(preResult);
                resultTViewCalc.setText(result);
            }
        });

        changeModeI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                engineeringMode.setVisibility(View.GONE);
                usualMode.setVisibility(View.VISIBLE);
            }
        });

        changeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usualMode.setVisibility(View.GONE);
                engineeringMode.setVisibility(View.VISIBLE);
            }
        });

        zeroBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "0");
            }
        });

        oneBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "1");
            }
        });

        twoBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "2");
            }
        });

        threeBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "3");
            }
        });

        fourBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "4");
            }
        });

        fiveBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "5");
            }
        });

        sixBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "6");
            }
        });

        sevenBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "7");
            }
        });

        eightBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "8");
            }
        });

        nineBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + "9");
            }
        });

        pointBtnI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText(resultTViewCalcI.getText() + ".");
            }
        });

        cancelBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTViewCalcI.setText("");
            }
        });

        plusBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 1;
                operand3 = Integer.parseInt((String) resultTViewCalcI.getText());
                resultTViewCalcI.setText("");
            }
        });

        minusBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 2;
                operand3 = Integer.parseInt((String) resultTViewCalcI.getText());
                resultTViewCalcI.setText("");
            }
        });

        multiplyBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 3;
                operand3 = Integer.parseInt((String) resultTViewCalcI.getText());
                resultTViewCalcI.setText("");
            }
        });

        divideBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAction = 4;
                operand3 = Integer.parseInt((String) resultTViewCalcI.getText());
                resultTViewCalcI.setText("");
            }
        });

        plusMinusBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt((String) resultTViewCalcI.getText());
                preChange = a - a - a;
                String change = String.valueOf(preChange);
                resultTViewCalcI.setText(change);
            }
        });

        equalsBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand4 = Integer.parseInt((String) resultTViewCalcI.getText());

                switch(flagAction) {
                    case 1:
                        preResult = operand3 + operand4;
                        break;
                    case 2:
                        preResult = operand3 - operand4;
                        break;
                    case 3:
                        preResult = operand3 * operand4;
                        break;
                    case 4:
                        preResult = operand3 / operand4;
                        break;
                    default:
                        resultTViewCalcI.setText("Операция не задана");
                }

                String result = String.valueOf(preResult);
                resultTViewCalcI.setText(result);
            }
        });
    }

    private void initViews() {
        resultTViewCalc = findViewById(R.id.resultTViewCalc);
        zeroBtn = findViewById(R.id.zeroBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        pointBtn = findViewById(R.id.pointBtn);
        cancelBtn = findViewById(R.id.cancelBtn);
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        divideBtn = findViewById(R.id.divideBtn);
        plusMinusBtn = findViewById(R.id.plusMinusBtn);
        percentBtn = findViewById(R.id.percent);
        equalsBtn = findViewById(R.id.equalsBtn);

        changeMode = findViewById(R.id.changeMode);
        changeModeI = findViewById(R.id.changeModeI);
        usualMode = findViewById(R.id.usualMode);
        engineeringMode = findViewById(R.id.engineeringMode);

        resultTViewCalcI = findViewById(R.id.resultTViewCalcI);
        zeroBtnI = findViewById(R.id.zeroBtnI);
        oneBtnI = findViewById(R.id.oneBtnI);
        twoBtnI = findViewById(R.id.twoBtnI);
        threeBtnI = findViewById(R.id.threeBtnI);
        fourBtnI = findViewById(R.id.fourBtnI);
        fiveBtnI = findViewById(R.id.fiveBtnI);
        sixBtnI = findViewById(R.id.sixBtnI);
        sevenBtnI = findViewById(R.id.sevenBtnI);
        eightBtnI = findViewById(R.id.eightBtnI);
        nineBtnI = findViewById(R.id.nineBtnI);
        pointBtnI = findViewById(R.id.pointBtnI);
        cancelBtnI = findViewById(R.id.cancelBtnI);
        plusBtnI = findViewById(R.id.plusBtnI);
        minusBtnI = findViewById(R.id.minusBtnI);
        multiplyBtnI = findViewById(R.id.multiplyBtnI);
        divideBtnI = findViewById(R.id.divideBtnI);
        plusMinusBtnI = findViewById(R.id.plusMinusBtnI);
        percentBtnI = findViewById(R.id.percentBtnI);
        equalsBtnI = findViewById(R.id.equalsBtnI);
    }
}
