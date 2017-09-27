package cn.edu.gdmec.android.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxTest extends AppCompatActivity {
    TextView textview;
    Button submit;
    CheckBox checkbox1;
    CheckBox checkbox2;
    CheckBox checkbox3;
    CheckBox checkbox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_check_box_test );

        textview=(TextView)findViewById ( R.id.textview );
        submit=(Button)findViewById ( R.id.submit );

        checkbox1=(CheckBox)findViewById ( R.id.checkbox1 );
        checkbox2=(CheckBox)findViewById ( R.id.checkbox2 );
        checkbox3=(CheckBox)findViewById ( R.id.checkbox3 );
        checkbox4=(CheckBox)findViewById ( R.id.checkbox4 );

        checkbox1.setOnCheckedChangeListener ( new CheckBox.OnCheckedChangeListener ()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if (checkbox2.isChecked ())
                {
                    DisplayToast("你选择了："+checkbox2.getText ());
                }
            }
        });
        checkbox2.setOnCheckedChangeListener ( new CheckBox.OnCheckedChangeListener ()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if (checkbox2.isChecked ())
                {
                    DisplayToast("你选择了："+checkbox2.getText ());
                }
            }
        });
        checkbox3.setOnCheckedChangeListener ( new CheckBox.OnCheckedChangeListener ()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if (checkbox3.isChecked ())
                {
                    DisplayToast("你选择了："+checkbox3.getText ());
                }
            }
        });
        checkbox4.setOnCheckedChangeListener ( new CheckBox.OnCheckedChangeListener ()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if (checkbox4.isChecked ())
                {
                    DisplayToast("你选择了："+checkbox4.getText ());
                }
            }
        });
        submit.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View v){
                int num=0;
                if (checkbox1.isChecked ())
                {
                    num++;

                }
                if (checkbox2.isChecked ())
                {
                    num++;

                }
                if (checkbox3.isChecked ())
                {
                    num++;

                }
                if (checkbox4.isChecked ())
                {
                    num++;

                }
                DisplayToast("你一共选择了"+num+"款Android手机！");
            }
        });
    }
    public void DisplayToast(String str)
    {
        Toast toast=Toast.makeText ( this,str,Toast.LENGTH_SHORT);
        toast.setGravity ( Gravity.TOP,0,200 );
        toast.show ();
    }
}
