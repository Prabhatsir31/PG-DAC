import { useState, Suspense, lazy } from "react";
import Loading from "./Loading.jsx";
import DelayForDemo from "./delayForDemo.jsx";

const MarkdownPreview = lazy(() =>
    DelayForDemo(import("./MarkdownPreview.jsx"))
);
export default function MarkdownEditor() {
  const [showPreview, setShowPreview] = useState(false);

  return (
    <>
      <label>
        <input
          type="checkbox"
          checked={showPreview}
          onChange={(e) => setShowPreview(e.target.checked)}
        />
        Show preview
      </label>
      <hr />
      {showPreview && (
        <Suspense fallback={<Loading />}>
          <h2>Preview</h2>
          <MarkdownPreview />
        </Suspense>
      )}
    </>
  );
} 

