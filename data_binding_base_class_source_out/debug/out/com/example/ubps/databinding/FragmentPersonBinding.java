// Generated by view binder compiler. Do not edit!
package com.example.ubps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ubps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPersonBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button download;

  @NonNull
  public final Button newpass;

  @NonNull
  public final FrameLayout person;

  @NonNull
  public final Button renew;

  private FragmentPersonBinding(@NonNull ScrollView rootView, @NonNull Button download,
      @NonNull Button newpass, @NonNull FrameLayout person, @NonNull Button renew) {
    this.rootView = rootView;
    this.download = download;
    this.newpass = newpass;
    this.person = person;
    this.renew = renew;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPersonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPersonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_person, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPersonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.download;
      Button download = ViewBindings.findChildViewById(rootView, id);
      if (download == null) {
        break missingId;
      }

      id = R.id.newpass;
      Button newpass = ViewBindings.findChildViewById(rootView, id);
      if (newpass == null) {
        break missingId;
      }

      id = R.id.person;
      FrameLayout person = ViewBindings.findChildViewById(rootView, id);
      if (person == null) {
        break missingId;
      }

      id = R.id.renew;
      Button renew = ViewBindings.findChildViewById(rootView, id);
      if (renew == null) {
        break missingId;
      }

      return new FragmentPersonBinding((ScrollView) rootView, download, newpass, person, renew);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}