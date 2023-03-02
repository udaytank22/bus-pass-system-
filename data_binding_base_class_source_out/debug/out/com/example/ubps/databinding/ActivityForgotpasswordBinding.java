// Generated by view binder compiler. Do not edit!
package com.example.ubps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ubps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotpasswordBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final EditText emailPhone;

  @NonNull
  public final TextView forgotPass1;

  @NonNull
  public final EditText newpass;

  @NonNull
  public final Button submit;

  private ActivityForgotpasswordBinding(@NonNull View rootView, @NonNull EditText emailPhone,
      @NonNull TextView forgotPass1, @NonNull EditText newpass, @NonNull Button submit) {
    this.rootView = rootView;
    this.emailPhone = emailPhone;
    this.forgotPass1 = forgotPass1;
    this.newpass = newpass;
    this.submit = submit;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotpasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotpasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgotpassword, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotpasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_phone;
      EditText emailPhone = ViewBindings.findChildViewById(rootView, id);
      if (emailPhone == null) {
        break missingId;
      }

      id = R.id.forgot_pass1;
      TextView forgotPass1 = ViewBindings.findChildViewById(rootView, id);
      if (forgotPass1 == null) {
        break missingId;
      }

      id = R.id.newpass;
      EditText newpass = ViewBindings.findChildViewById(rootView, id);
      if (newpass == null) {
        break missingId;
      }

      id = R.id.submit;
      Button submit = ViewBindings.findChildViewById(rootView, id);
      if (submit == null) {
        break missingId;
      }

      return new ActivityForgotpasswordBinding(rootView, emailPhone, forgotPass1, newpass, submit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}